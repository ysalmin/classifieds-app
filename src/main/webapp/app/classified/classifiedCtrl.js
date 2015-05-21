'use strict';

angular.module('classifieds-app.classified').

    controller('ClassifiedCtrl', ['$scope', 'Categories', 'Classifieds', '$stateParams', function ($scope, Categories, Classifieds, $stateParams) {

        $scope.classified = Classifieds.get({id: $stateParams.id})

    }]);
