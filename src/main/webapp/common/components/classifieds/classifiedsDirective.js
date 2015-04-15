'use strict';

angular.module('classifieds-app.common.components.classifieds')

    .directive('classifiedsClassifieds', function () {

        return {
            restrict: 'E',
            transclude: true,
            scope: {

            },
            templateUrl: 'common/components/classifieds/classifieds.tpl.html',
            link: function linkFn (scope, element, attrs) {

            }
        };

    });
