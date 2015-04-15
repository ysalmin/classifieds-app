'use strict';

angular.module('classifieds-app.common.components.categories').

controller('CategoriesCtrl', ['$scope','categoriesService',function ($scope, categoriesService) {
    console.log(categoriesService);
        $scope.categories = categoriesService.query();
}]);
