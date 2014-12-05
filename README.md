Homogenous Templating
=====================

This talk is about templating and the potential of a homogenous
solution for both server- and client-side using the
[Mustache](http://mustache.github.io) templating library.

## Talk

The [Reveal.JS](http://lab.hakim.se/reveal-js) presentation can easily
be started using [Grunt](http://gruntjs.com), as long as you have a
properly setup [Node.js](http://nodejs.org) environment. To start
everyting simply run:

    npm install
    grunt serve
   

## Demo: Spring MVC

We provide a demo, a simple Spring MVC application, as an example of
how server-side and client-side templating can harmonize with each
other.

The demo application is built using [Maven](http://maven.apache.org),
and uses an embedded [Jetty](http://eclipse.org/jetty/) web server. You
should be able to compile and run it, with the command below, and then
browse to the host and port number that was printed on the command
line.

    mvn jetty:run
    
Good luck!