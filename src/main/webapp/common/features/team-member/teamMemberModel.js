'use strict';

angular.module('classifieds-app.common.features.team-member').

factory('TeamMemberModel', function (AbstractEntity) {

    var TeamMemberModel = AbstractEntity.extend({
        /**
         * Initialize object
         * @param {String} name
         */
        initialize: function (name) {
            this.name = name;
            this._skills = [];
        },
        /**
         * Add skill
         * @param {String} skill
         * @returns {TeamMemberModel}
         */
        addSkill: function (skill) {
            if (this._skills.indexOf(skill) === -1) {
                this._skills.push(skill);
            }
            return this;
        },
        /**
         * Add skills
         * @param {Array.<String>} skills
         * @returns {TeamMemberModel}
         */
        addSkills: function (skills) {
            skills.forEach(function (skill) {
                this.addSkill(skill);
            }, this);
            return this;
        },
        /**
         * Get skills
         * @returns {Array.<String>}
         */
        getSkills: function () {
            return this._skills.slice();
        }
    });

    return TeamMemberModel;
});