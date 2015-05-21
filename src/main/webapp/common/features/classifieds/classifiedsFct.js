'use strict';

angular.module('classifieds-app.common.features.categories').

    factory('Classifieds',['$resource', function ($resource) {
        return $resource(
            '/rest/classified/category/:id',
            {},
            {
                query: {
                    method:'GET',params:{id:'id'}, isArray:true
                }
            }
        );

    }]);
