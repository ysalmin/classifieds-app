'use strict';

angular.module('classifieds-app.common.components.header')

.directive('classifiedsHeader', function () {

    return {
        restrict: 'E',
        transclude: true,
        scope: {
            //title: '@classifiedsHeaderTitle',
            //homeState: '@classifiedsHeaderHomeState'
        },
        templateUrl: 'common/components/header/header.tpl.html',
        link: function linkFn (scope, element, attrs) {

        }
    };

});
