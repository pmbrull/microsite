mode=$1

if [ $mode = "build" ]; then

  echo "building site..."

  sbt clean
  sbt makeMicrosite
  # light-style.css is missing, so we copy it
  mkdir target/site/css
  cp docs/resources/styles/light-style.css target/site/css/
  cd target/site/
  jekyll serve -b /microsite

elif [ $mode = "publish" ]; then

  echo "publishing site..."

  mkdir .tmp
  cd .tmp
  git clone --single-branch --branch gh-pages https://github.com/pmbrull/microsite.git .
  rm -rf *
  cp -R ../target/site/_site/* .
  git add .
  git commit -am "update site"
  git push origin gh-pages
  cd ..
  rm -rf .tmp

else echo "Input must be either build or publish"
fi
