/*
 * Use App.getDependency for Dependency Injection
 * eg: var DialogService = App.getDependency('DialogService');
 */

/*
 * This function will be invoked when any of this prefab's property is changed
 * @key: property name
 * @newVal: new value of the property
 * @oldVal: old value of the property
 */
Prefab.onPropertyChange = function (key, newVal, oldVal) {
    debugger;
    switch (key) {
        case "qodprofile":
            Prefab.setSlider(Prefab.qodprofile.split("_")[1], "--slider1-bg");
            Prefab.setSlider(Prefab.qodprofile.split("_")[3], "--slider2-bg");
            break;
    }

};
Prefab.onReady = function () {
    debugger;
    document.querySelectorAll('.pull-right').forEach(item => item.style.display = 'none');
    document.querySelectorAll('.pull-left').forEach(item => item.style.display = 'none');
    document.documentElement.style.setProperty("--primary-color", Prefab.primarycolor);
    if (Prefab.qodprofile) {
        Prefab.setSlider(Prefab.qodprofile.split("_")[1], "--slider1-bg");
        Prefab.setSlider(Prefab.qodprofile.split("_")[3], "--slider2-bg");
    }
};
// Prefab.setSlider = function (profile, cssVariable) {
//     switch (profile) {
//         case "S": document.documentElement.style.setProperty(cssVariable, "#E5E7EB");
//             break;
//         case "M": document.documentElement.style.setProperty(cssVariable, "linear-gradient(90deg, #C5CBE0 0%, #1666FF 50%, #d5cebc 50%, #d5cebc 100%)");
//             break;
//         case "L": document.documentElement.style.setProperty(cssVariable, "linear-gradient(90deg, #C5CBE0 0%, #1666FF 50%, #115be7 100%)");
//             break;
//     }
// }
Prefab.setSlider = function (profile, cssVariable) {
    switch (profile) {
        case "S": document.documentElement.style.setProperty(cssVariable, "#E5E7EB");
            break;
        case "M": document.documentElement.style.setProperty(cssVariable, "linear-gradient(90deg, #54D292 0%, #1f69f6 50%, #d5cebc 50%, #d5cebc 100%)");
            break;
        case "L": document.documentElement.style.setProperty(cssVariable, "linear-gradient(90deg, #54D292 0%, #1f69f6 50%,#1f69f6 50%, #115be7 100%)");
            break;
    }
}

Prefab.slider1Change = function ($event, widget, newVal, oldVal) {
    Prefab.setGrading(newVal, "--slider1-bg");
};

Prefab.slider2Change = function ($event, widget, newVal, oldVal) {
    Prefab.setGrading(newVal, "--slider2-bg");
};

// Prefab.setGrading = function (value, cssVariable) {
//     let color = value == 2 ? "linear-gradient(90deg, #C5CBE0 0%, #1666FF 50%, #d5cebc 50%, #d5cebc 100%)" : value == 3 ? "linear-gradient(90deg, #C5CBE0 0%, #1666FF 50%, #115be7 100%)" : "#E5E7EB";
//     document.documentElement.style.setProperty(cssVariable, color);
// }
Prefab.setGrading = function (value, cssVariable) {
    debugger;
    let color = value == 2 ? "linear-gradient(90deg, #54D292 0%, #1f69f6 50%, #d5cebc 50%, #d5cebc 100%)" : value == 3 ? "linear-gradient(90deg, #54D292 0%, #1f69f6 50%,#1f69f6 50%, #115be7 100%)" : "#E5E7EB";
    document.documentElement.style.setProperty(cssVariable, color);
}
Prefab.wsCreateQODSessiononSuccess = function (variable, data) {
    debugger;
    if (data.status === "success") {
        Prefab.Widgets.slider1.datavalue = data.data.qosProfile.split("_")[1] == "M" ? 2 : data.data.qosProfile.split("_")[1] == "L" ? 3 : 1;
        Prefab.Widgets.slider2.datavalue = data.data.qosProfile.split("_")[1] == "M" ? 2 : data.data.qosProfile.split("_")[1] == "L" ? 3 : 1;
        Prefab.setSlider(data.data.qosProfile.split("_")[1], "--slider1-bg");
        Prefab.setSlider(data.data.qosProfile.split("_")[3], "--slider2-bg");
        Prefab.Actions.notificationActionQODRequest.invoke();
    }
};
