'use strict';

angular.module('classifieds-app.common.features.categories').

    factory('Categories', ['$resource', function ($resource) {
        return $resource('/rest/category/:id', {id:'@id'});

    }]);
