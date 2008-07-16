Event.observe(window, "load", function() {
		$A(["all", "why", "tdd", "bdd", "coverage", "refactoring",
                    "mocking", "refactotum", "additional" ]).each(function(elem) {
    Event.observe($("choose_" + elem), "click", function() {
      $$(".all").each(function(item) {item.hide();});
      $$("." + elem).each(function(item) {item.show();});
    });
  });
});