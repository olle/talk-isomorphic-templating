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
      talk: {
        options: {
          port: 8088,
          open: 'http://localhost:8088/talk/',
          livereload: true,
        },
      },
      demo: {
        options: {
          port: 8089,
          open: 'http://localhost:8089/src/main/webapp/index.html',
          livereload: 35721,
        }
      }
    },

    watch: {
      talk: {
        files: ['talk/*.html'],
        options: {
          livereload: true,
        },
      },
      demo: {
        files: ['src/main/webapp/**/*'],
        options: {
          livereload: 35721
        }
      }
    },

  });

  grunt.registerTask('serve', [
    'bower-install-simple',
    'connect:talk',
    'watch:talk'
  ]);

  grunt.registerTask('demo', [
    'bower-install-simple',
    'connect:demo',
    'watch:demo'
  ]);

  grunt.registerTask('default', ['serve']);

};
