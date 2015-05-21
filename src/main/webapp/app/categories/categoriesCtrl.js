'use strict';

angular.module('classifieds-app.categories').

    controller('CategoriesCtrl', ["$scope", "Categories", function ($scope, Categories) {
        if (!$scope.categories) {
            $scope.categories = Categories.query();
        }
    }]);
