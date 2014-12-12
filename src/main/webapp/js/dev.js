require(['jquery', 'mustache'], function($, Mustache) {

  var partials = {
    '_person': $.ajax({
      url: '_person.html',
      async: false
    }).responseText
  };

  if ($('html').hasClass('{{no-server}}')) {

    [{
      sel: '#people',
      data: {
        people: [{
          name: 'Holly Woodfield',
          age: 53
        }, {
          name: 'Bender Robot',
          age: 333
        }, {
          name: 'Barbie Doller',
          age: 16
        }]
      }
    }, {
      sel: 'header',
      data: {
        greeting: 'Hello from Mustache.js!',
      }
    }].forEach(function(obj, _)  {
      var template = $(obj.sel).html().replace('&gt;', '>');
      var result = Mustache.render(template, obj.data, partials);
      $(obj.sel).html(result);
    });

    $('section.container').append('<small>View source: <a href="js/dev.js">dev.js</a></small>');

  }

});
