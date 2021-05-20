def buildApp() {
  echo 'we are building app..(using groovy script)'
}

def testApp() {
  echo 'we are testing app..(using groovy script)'
}

def deployApp() {
  echo 'we are deploying  app..(using groovy script)'
  echo " deploying  version.. ${params.VERSION}"
}

return this
