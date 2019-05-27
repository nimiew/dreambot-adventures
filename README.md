![alt text](https://dreambot.org/forums/uploads/monthly_2018_05/logo.png.0cd11afbb76d7c643d480f6aaaca8e98.png "Logo Title Text 1") 

# Dreambot Quickstart 
Dreambot quickstart project for Maven. Requires you to have Dreambot client installed. 

## Prerequisites
After that you should have `client.jar` file installed in `%userprofile%\DreamBot\BotData\` directory. Install `client.jar` file in local Maven repository with the following command: `mvn install:install-file -DgroupId=dreambot -DartifactId=client -Dversion=1.0.0 -Dpackaging=jar -Dfile=client.jar`. 

That's it, you are good to go. Open the project and start scripting.
    
## Packaging 
After you finish your script. Build the project with `mvn package`, but don't forget to specify the `%userprofile%\DreamBot\` directory in `pom.xml` file. 

