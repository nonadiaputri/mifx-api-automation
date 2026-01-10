How to make API automation  using testng and rest assured
1. Open eclipse - Click File - New - Maven Project
2. Set the workspace location (if needed) and checked click simple project then click next
3. Fill the groupId, ArtifactId, and the Name, than click finish
4. Open the project, then open pom.xml file.
Add dependency for example : testng, rest assured,json-path, common-io,jakson xml
Save the pom.xml
5. Create the folder structure like this one

    <img width="323" height="245" alt="image" src="https://github.com/user-attachments/assets/14fb0f31-d005-4501-9ea1-13d240aeaef0" />

   Inside com.mifx.api.test you can define the feature you are testing in different java class. You can define positive and negative scenario inside java class.
6. Assert the response you get to validate the api

   <img width="571" height="316" alt="image" src="https://github.com/user-attachments/assets/51905afe-7b3e-4baa-aa52-f0bcd18362d5" />
        


How to run the automation
1. Clik @run in method to run single method or click RunAll in the beginning of class to run all method inside class

   <img width="580" height="434" alt="image" src="https://github.com/user-attachments/assets/d14384e8-9aae-4181-b0c0-3d9cbaf01a05" />
  
