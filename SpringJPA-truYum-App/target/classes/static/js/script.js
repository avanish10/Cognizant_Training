function validateForm() {
	var title = document.getElementById("name").value;
	var price = document.getElementById("price").value;
	var dateOfLaunch = document.getElementById("dateOfLaunch").value;
	var category = document.getElementById("category").value;
	console.log(dateOfLaunch)
	var datePattern = /^\d{4}-\d{2}-\d{2}$/;
	var error = "";
	var flag = true;
	// title validation
	if (title.length == 0) {
		error += "!!  Title is required.\n";
		flag = false;
	}
	if (title.length < 2 || title.length > 65) {
		error += "!!  Title should have 2 to 65 characters.\n";
		flag = false;
	}

	// price validation
	if (price.length == 0) {
		error += "!!  Price is required.\n";
		flag = false;
	}
	if (isNaN(price)) {
		error += "!!  Price has to be a number.\n";
		flag = false;
	}

	// date of launch validation
	if (dateOfLaunch.length == 0) {
		error += "!!  Date of Launch is required.\n";
		flag = false;
	}
	if (!datePattern.test(dateOfLaunch)) {
		error += "!! Date of Launch should be in format dd/mm/yyyy\n";
		flag = false;
	} else {
		if (dateOfLaunch.substring(0, 2) < 1
				|| dateOfLaunch.substring(0, 2) > 31) {
			error += "!! Invalid value for day: "
					+ dateOfLaunch.substring(0, 2) + "\n";
			flag = false;
		}
		if (dateOfLaunch.substring(3, 5) < 1
				|| dateOfLaunch.substring(3, 5) > 12) {
			error += "!! Invalid value for month: "
					+ dateOfLaunch.substring(3, 5) + "\n";
			flag = false;
		}
	}

	// category validation
	if (category == "select") {
		error += "!!  Select one category.";
		flag = false;
	}
	if (error.length != 0) {
		alert(error);
	}
	return flag;
}