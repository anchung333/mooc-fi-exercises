# Java Programming Exercises
My implementations to the exercises found on the University of Helsinki's free Massive Open Online Course (MOOC) on Java Programming.

### Tip
If you take this course and like me realize halfway through the course you want to upload all your hard work and progress to Github, just run this little script to copy
over only the main java components of each exercise (your implementations + the test java files) to the directory of your choice and save yourself a lot of time.

for folder in */; do
	echo $folder
	mkdir /path/to/directory/$folder
	cp -R $folder/src /path/to/directory/$folder
done 
