module.exports = function(grunt) {
  'use strict';

  require('load-grunt-tasks')(grunt);

  grunt.initConfig({

    'bower-install-simple': {
      all: {
        // all defaults
      },
    },

    connect: {
      example: {
        options: {
          port: 8088,
          open: 'http://localhost:8088/talk/',
          livereload: true
        },
      },
    },

    watch: {
      presentation: {
        files: ['talk/*.html'],
        options: {
          livereload: true
        },
      },
    },

  });

  grunt.registerTask('default', [
    'bower-install-simple',
    'connect',
    'watch'
  ]);

};
