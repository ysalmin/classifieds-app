'use strict';

angular.module('classifieds-app.common.components.categories').

controller('CategoriesCtrl', ['$scope','Categories','$stateParams',function ($scope, Categories, $stateParams) {
        console.log("Categories: ",$stateParams);
}]);
