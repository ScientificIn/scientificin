/* home */
$(document).ready(function() {
  var words = [{
    text: "Lorem",
    weight: 13
  }, {
    text: "Ipsum",
    weight: 10.5
  }, {
    text: "Dolor",
    weight: 9.4
  }, {
    text: "Sit",
    weight: 8
  }, {
    text: "Amet",
    weight: 6.2
  }, {
    text: "Consectetur",
    weight: 5
  }, {
    text: "Adipiscing",
    weight: 5
  }];

  var some_words_with_same_weight =
    $("#cloud-home").jQCloud(words, {
      width: 500,
      height: 350
    });

});