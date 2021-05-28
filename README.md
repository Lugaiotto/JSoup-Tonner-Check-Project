# JSoup-Tonner-Check-Project

A simple JSoup project to scrap some informations from a web site (local IP) about printer tonners if it's empty or the printer does have a code error.

# # :rocket: How it works: 

JSoup is a HTML parser who get the information (scrapping) from a site to visualize or modify. This Java project starts entering in a printer IP Address and scrap the information about status/tonner status (empty or full) and if the tonner is removed. After that, it returns in a command line if the printer status is ok or not.

The project is useful for IT Support roles who needs to constant check if the company printers have some trouble/error or need to change the tonner. It's not 
something big but it's really useful, feel free to test.

 # :hammer_and_wrench: How to install:

  First you need to clone this repository using the command:
  
  > $ git clone https://github.com/Lugaiotto/JSoup-Tonner-Check-Project.git

  Then you need to install Java JDK: 
  
  > jdk-15.0.2_windows-x64 or jdk-15.0.2_windows-x86 https://www.oracle.com/java/technologies/javase/jdk15-archive-downloads.html
  
  If you are using Linux, maybe the command can be different.
  
  After that, install JDK and create a .jar file poiting to Main.java and open it.
  
  Unfortunately it only works with specific sites (Ricoh Printers), but you can change the scrapping location to any site,
  you just need to change:
  
  > Jsoup.connect("Https://mysitehere").get();
  and
  > getElementsByClass("change me").text();
 
 
  # This Web Scrapper was created for studying purposes, in this project i've learned:
 
 
  * How to use and handle Web Scrappers - :heavy_check_mark:
  * Automatize tasks using Java - :heavy_check_mark:
  * Class and Object creation to split code in minor modules - :heavy_check_mark:
