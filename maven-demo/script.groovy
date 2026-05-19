def buildApp(){
    echo 'Building Process ... ' 
}

def testApp(){
    echo 'Testing Process ... '
}

def deployApp(){
    echo 'Deplolying Process ... '
    echo "Deploying the version ${params.VERSION}"
}

return this