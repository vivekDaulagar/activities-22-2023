Steps to follow
Fork this repository, you will see a fork button as mentioned in the image image

Now go to your account dashboard, you will see a copy of this repoistory in your account, you can click on your repositories(click on your account at the top right) to see the copy of the repository you forked

Click on that repository link, where you will see the content of the repository and a green button called <>Code as show in the image, click on the <>Code button to see the URL image

Copy that url and open the Git bash terminal in your machine, ensure you are opening a folder which is not part of any existing repository

In the Git bash terminal enter the following command & hit enter, replace <url-copied> with the URL what you copied from the <>Code button

git clone <url-copied>
You must see a folder getting created which will have the same name of the repository you have in your account

Save/Create your projects inside this repository

Once you are done with the project, push this project to your account following the below steps

Open Git bash terminal in your machine inside the parent folder of the repository, parent folder is the folder which will have the name of the repository, if you are in any other location it may not work as expected

Enter below git commands in the Git bash terminal

git add .
# make sure you have entered a dot after git add & there's a space between git, add and a dot
git commit -m 'some message to describe what you are saving'
example: git commit -m 'final project'
git push -u origin master
Now you must able to see the final project pushed in the Git Hub account Note: If you are using Git Bash for the first time, you will be asked to authenticate, you have to provide the required credentials and then perform the git commit & git push
