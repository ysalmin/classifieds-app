'use strict';

angular.module('classifieds-app.common.components.footer')

.directive('classifiedsFooter', function () {

    return {
        restrict: 'E',
        transclude: true,
        scope: {

        },
        templateUrl: 'common/components/footer/footer.tpl.html',
        link: function linkFn (scope, element, attrs) {

        }
    };

});
