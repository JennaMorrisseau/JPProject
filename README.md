# JPProject

# Oracle Production Line

This program is used to store data about a production line. There are 2 products that can be created and stored, as well as an employee 
ID and a department number. 

# Program Classes

There are 16 classes 
  1. AudioPlayer:
    Extends Product and implements MultimediaControl. 
    Creates an audio player object with audio specification, media type, and name.
   
  2. AudioPlayerDriver:
      Made to test the functionality of the AudioPlayer class. Makes an audio player, tests the 'functionality' of the player, and 
      prints it to the screen. 
      
  3. Controller:
      Controls the GUI components. 
      Buttons open new screens, but information entered isn't stored or displayed. 
      
  4. EmployeeInfo:
      Uses scanner object to get first and last name from the user. Makes the employee's code in the format of first letter of first 
      name and the full last name. 
      Gets department ID from user and checks for proper format. 
      
  5. Item: 
       Interface used by Product to give same functionality to each product made. 
       
  6. ItemType:
        Enum with the four possible categorizies of items made on the production line and the codes associated with each category.
        
  7. MonitorType:
        Enum with the two possible monitors each media player can have. 
        
  8. MediaPlayer:
        Extends Product and implements MultimediaControl. 
        Creates a media player object with the monitor type, screen, and name. 
        
  9. MediaPlayerDriver:
        Made to test the functionality of the MediaPlayer class. Creates two media players and prints them to the screen. 
        
  10. MultimediaControl:
        Interface used by audio players and media player to give them functionality. 
        
  11. ProcessFiles:
        Used to save information entered to a .txt file. 
        
  12. Product: 
        Implements Item. 
        General class that gives a product a manufacturer, the manufactured date, a serial number, and a name. 
        
  13. Screen: 
        Implements ScreenSpecs.
         Used by media players to give them the resolution, refresh time, and response time. 
         
  14. ScreenDriver: 
        Made to test the functionality of the Screen class. 
        Creates a screen object. 
        
  15. ScreenSpecs: 
        Interface used so each screen object will have resolution, refresh time, and response time. 
        
  16. ViewFileInfo: 
        Displays what is saved in the .txt file. 
  

This program follows the instructions given by Oracle. Through step 20 has been created and is working. GUI is made 
but not functional yet. 

Made for COP 3003 fall 2018  
