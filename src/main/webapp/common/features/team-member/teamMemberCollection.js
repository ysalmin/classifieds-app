'use strict';

angular.module('classifieds-app.common.features.team-member').

factory('TeamMemberCollection', function (AbstractEntity, TeamMemberModel) {

    var TeamMemberCollection = AbstractEntity.extend({
        /**
         * Initialize collection
         * @param {String} collectionName
         */
        initialize: function (collectionName) {
            this.collectionName = collectionName;
            this.models = [];
        },
        /**
         * Add member
         * @param {TeamMemberModel} member
         * @returns {TeamMemberCollection}
         */
        addMember: function (member) {
            if (member instanceof TeamMemberModel) {
                this.models.push(member);
            }
            return this;
        }
    });

    return TeamMemberCollection;
});