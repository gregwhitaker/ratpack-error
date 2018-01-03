# ratpack-error
[![Build Status](https://travis-ci.org/gregwhitaker/ratpack-error.svg?branch=master)](https://travis-ci.org/gregwhitaker/ratpack-error)

A [Ratpack](http://www.ratpack.io) module that provides a consistent and easy-to-use error handling framework for restful web services.

The ratpack-error module provides a set of base exception classes that when extended give you beautiful, user-friendly, error messages like the following:

* Error Message Example

        {
            "status": 404,
            "errorCode": "123ABC",
            "errorMessage": "Not Found",
            "errorDetail": "Foo widget with id '123' was not found",
            "errorDetailUrl": "https://docs.test.com/errors/123abc"
        }
        
 * Field Level Error Message Example
    
         {
            "status": 400,
            "errorCode": "321ABC",
            "errorMessage": "Bad Request",
            "errorDetail": "Invalid query parameters",
            "fieldErrors": [
                {
                    "field": "numPages",
                    "errorCode": "321ABC-456",
                    "errorMessage": "Parameter 'numPages' must be an integer."
                }
            ]
        }
        
## Getting Started
The ratpack-error module is available via [JCenter](https://bintray.com/gregwhitaker/maven/ratpack-error).

## Building From Source
The module can built using the following Gradle command:

    $ ./gradlew clean build

## Bugs and Feedback
For bugs, questions, and discussions please use the [Github Issues](https://github.com/gregwhitaker/ratpack-error/issues).

## License
Copyright 2017 Greg Whitaker

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
