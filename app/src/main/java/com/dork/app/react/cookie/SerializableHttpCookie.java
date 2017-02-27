package com.dork.app.react.cookie;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.HttpCookie;

public class SerializableHttpCookie implements Serializable {
    private static final long serialVersionUID = 6374381323722046732L;

    private transient final HttpCookie _cookie;
    private transient HttpCookie _clientCookie;

    public SerializableHttpCookie(HttpCookie cookie) {
        this._cookie = cookie;
    }

    public HttpCookie getCookie() {
        HttpCookie bestCookie = _cookie;
        if (_clientCookie != null) {
            bestCookie = _clientCookie;
        }
        return bestCookie;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeObject(_cookie.getName());
        out.writeObject(_cookie.getValue());
        out.writeObject(_cookie.getComment());
        out.writeObject(_cookie.getCommentURL());
        out.writeObject(_cookie.getDomain());
        out.writeLong(_cookie.getMaxAge());
        out.writeObject(_cookie.getPath());
        out.writeObject(_cookie.getPortlist());
        out.writeInt(_cookie.getVersion());
        out.writeBoolean(_cookie.getSecure());
        out.writeBoolean(_cookie.getDiscard());
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        String name = (String) in.readObject();
        String value = (String) in.readObject();
        _clientCookie = new HttpCookie(name, value);
        _clientCookie.setComment((String) in.readObject());
        _clientCookie.setCommentURL((String) in.readObject());
        _clientCookie.setDomain((String) in.readObject());
        _clientCookie.setMaxAge(in.readLong());
        _clientCookie.setPath((String) in.readObject());
        _clientCookie.setPortlist((String) in.readObject());
        _clientCookie.setVersion(in.readInt());
        _clientCookie.setSecure(in.readBoolean());
        _clientCookie.setDiscard(in.readBoolean());
    }
}
