# creditsuisse
Custom-build server logs different events to a file named logfile.txt. Every event has 2 entries in the file - one entry when the event was started and another when the event was finished. The entries in the file have no specific order (a finish event could occur before a start event for a given id)


How to RUN this Spring boot application?

mvn clean install -X
navigate to com.creditsuisse.ChallengeApplication and run this class

