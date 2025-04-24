module KnightsQuest {
    requires hanyaeger;

    exports org.example;

    opens images to hanyaeger;
    opens sounds to hanyaeger;
    opens fonts to hanyaeger;
    opens sprites to hanyaeger;

}