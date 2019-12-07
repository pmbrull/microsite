sbt clean
sbt makeMicrosite
# light-style.css is missing, so we copy it
mkdir target/site/css
cp docs/resources/styles/light-style.css target/site/css/
cd target/site/
jekyll serve -b /microsite