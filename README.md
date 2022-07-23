# labReminder
A project currently underway at Chemical Labs, Inc., requires that a substance be continually heated in a vat. A technician must check the substance’s temperature every 15 minutes.
If the substance’s temperature does not exceed 102.5 degrees Celsius, then the technician
does nothing. However, if the temperature is greater than 102.5 degrees Celsius, the technician must turn down the vat’s thermostat, wait 5 minutes, and check the temperature again.
The technician repeats these steps until the temperature does not exceed 102.5 degrees
Celsius. The director of engineering has asked you to write a program that guides the technician through this process.
Here is the algorithm:
1. Prompt the user to enter the substance’s temperature.
2. Repeat the following steps as long as the temperature is greater than 102.5 degrees
   Celsius:
   (a) Tell the technician to turn down the thermostat, wait 5 minutes, and check the
   temperature again.
   (b) Prompt the user to enter the substance’s temperature.
3. After the loop finishes, tell the technician that the temperature is acceptable and to
   check it again in 15 minutes.