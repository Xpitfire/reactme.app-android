rem This command requires a working swagger-codegen compilation see:
rem https://github.com/swagger-api/swagger-codegen
rem and set environment variable pointing to %SWAGGER_HOME%, which represents
rem the git checkout directory!
rem Configure proper IP address!
java -jar %SWAGGER_HOME%\modules\swagger-codegen-cli\target\swagger-codegen-cli.jar generate --api-package com.dork.app.react.api --invoker-package com.dork.app.react.api.invoker --model-package com.dork.app.react.api.model -i http://dork-943e.azurewebsites.net/swagger/v1/swagger.json -l java -o .\swagger