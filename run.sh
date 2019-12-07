sbt clean
sbt makeMicrosite
cd target/site/
echo $pwd
jekyll serve -b /microsite