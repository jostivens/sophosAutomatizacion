*** Settings ***
Library     SeleniumLibrary    


*** Test Cases ***
BuscarPalabraEnGoogle
    Open Browser               https://www.google.com/    chrome 
    Set Browser Implicit Wait                             7
    Input Text                 name=q    automatizacion
    Press Keys                 name=q    ESCAPE
    Click Button               name=btnK  
    close browser
    log    test realizado  
