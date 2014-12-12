require(['jquery', 'mustache'], function($, Mustache) {

  var partials = {
    '_person': $.ajax({
      url: '_person.html',
      async: false
    }).responseText
  };

  $('#add-person').on('submit', function(event) {

    event.preventDefault();
    var form = event.target;

    var model = {
      name: form.name.value,
      age: form.age.value,
    };

    var person = Mustache.render(partials._person, model);
    $('#people').append(person);

    form.reset();
  });

});
