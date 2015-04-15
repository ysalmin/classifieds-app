'use strict';

angular.module('classifieds-app.common.components.search')

    .directive('classifiedsSearch', function () {

        return {
            restrict: 'E',
     //       transclude: true,
            scope: {
                //title: '@classifiedsHeaderTitle',
                //homeState: '@classifiedsHeaderHomeState'
            },
            templateUrl: 'common/components/search/search.tpl.html',
            link: function linkFn (scope, element, attrs) {

            }
        };

    });
