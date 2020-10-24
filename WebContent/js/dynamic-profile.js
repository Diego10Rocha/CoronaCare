function enableAddPatientToFamily() {
	obj = document.getElementById("form-add-patient-to-family").style;
	obj.visibility = "visible";
	obj2 = document.getElementById("send-message").style;
	obj2.visibility = "hidden";
}

function sendMessage() {
	obj2 = document.getElementById("send-message").style;
	obj2.visibility = "visible";
	obj = document.getElementById("form-add-patient-to-family").style;
	obj.visibility = "hidden";
}