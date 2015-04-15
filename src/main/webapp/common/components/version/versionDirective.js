'use strict';

angular.module('classifieds-app.common.components.version')

.directive('classifiedsAppVersion', ['version', function(version) {
    return function(scope, elm, attrs) {
        elm.text(version);
    };
}]);