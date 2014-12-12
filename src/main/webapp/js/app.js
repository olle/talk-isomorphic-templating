require.config({
  baseUrl: './js/',
  paths: {
    jquery: '../assets/jquery/dist/jquery',
    mustache: '../assets/mustache/mustache',
  }
});

require(['add-person']);

require(['dev']);
