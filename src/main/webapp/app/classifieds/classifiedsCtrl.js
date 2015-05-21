'use strict';

angular.module('classifieds-app.classifieds').

    controller('ClassifiedsCtrl', ['$scope', 'Categories', 'Classifieds', '$stateParams', function ($scope, Categories, Classifieds, $stateParams) {

        $scope.classifieds = Classifieds.query({id: $stateParams.id})

    }]);
