'use strict';

angular.module('classifieds-app.common.features.categories').

    provider('categories', function () {
        this.$get = function(){
            return [
                {
                    id:"1",
                    "Name": "Computers",
                    "url": "computers"
                },
                {
                    id:"2",
                    "Name": "Clothes",
                    "url": "clothes"
                },
                {
                    id:"3",
                    "Name": "Another stuff",
                    "url": "anotherstuff"
                }];
    }

    });
