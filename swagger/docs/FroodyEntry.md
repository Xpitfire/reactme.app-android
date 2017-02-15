
# FroodyEntry

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entryId** | **Long** | Entry ** Unique ID representing the entry ID in the database |  [optional]
**userId** | **Long** | User.userId ** UserId that this entry belongs to. -1 if not belongs to client |  [optional]
**geohash** | **String** | Entry ** GeoHash of location(lat,lng) with precision &gt;&#x3D; 9 |  [optional]
**creationDate** | [**DateTime**](DateTime.md) | Entry ** Timestamp of creation |  [optional]
**modificationDate** | [**DateTime**](DateTime.md) | Entry ** Timestamp of modification |  [optional]
**entryType** | **Integer** | Entry ** Type of entry (e.g. pear, apple) |  [optional]
**certificationType** | **Integer** | Entry ** Type of certification (None&#x3D;0/bio&#x3D;1/demeter&#x3D;2) |  [optional]
**distributionType** | **Integer** | Entry ** Type of distribution (Free&#x3D;0/Selling&#x3D;1/..) |  [optional]
**description** | **String** | Entry ** Description what is offered |  [optional]
**contact** | **String** | Entry ** Contact informations |  [optional]
**address** | **String** | Entry ** Resolved address from latitude and longitude |  [optional]
**wasDeleted** | **Boolean** | Entry ** True if the entry was requested for deletion |  [optional]
**managementCode** | **Integer** | Entry ** Management code, or -1 if not belongs to client |  [optional]



