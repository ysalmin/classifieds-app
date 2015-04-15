'use strict';

angular.module('classifieds-app.common.features.categories').

    factory('categoriesService', ['$resource', function ($resource) {
        return $resource('/rest/category/:id', {id:'@id'});
        //return $resource('/rest/category');
    }]);
