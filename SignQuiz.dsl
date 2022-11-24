workspace {
    model {
        user = person "Aprendiz" "person interested in learning sign language""aprendiz"
        tecnico = person "Especialista"
        
        RepairIT = softwareSystem "SignQuiz" {
            LandingPage = container "Web Application" "View the options to download the mobile application""""Web" {
                user -> this "Visit SignQuiz"
            }
           mobileApp = container "Mobile Application" "Provides a set of functionalities for the user""""Mobile" {
            user -> this "Log in with your account to the application"
           
            SinginController = component "Sing in Controller" "Used to control apprentice and specialist login" {
                 user -> this "Make call to"
                 
            }
           
            SecurityComponent = component "Security Component" "Contains all the functionality to change passwords, etc." { {
                
            }
            LearningMaterials = component "Payment" "Composes all the payment and collection of users"  {
                user -> this "Make SignQuiz To"
             
            }
            MyLearningPaths = component "My Learning Path" "Displays a statistic with the results of the tests and readings performed"{
                user -> this "Make call to" 
            }
            Lear = component "Learning Path Performance Reporting" "Visualize your overall performance of the application"{
                
            }
            test = component "Test Controller " "View the statistics of everything you have been doing in the application, tests, materials, etc." {
                user -> this "Make SignQuiz To"

            }
            TestPerformed = component "View test resultst" "You can see the tests carried out with the results you chose"
           
            SinginController -> SecurityComponent "Uses"
           
            test -> TestPerformed "Use"
            MyLearningPaths -> Lear "use"

           }
          
           database = container "Database" "Store user registration, hash authentication credentials""""Database" {
            mobileApp -> this "Control user registration"
            SecurityComponent -> this "Reads from and Writes"
             }
        }
        reportingSystem = softwareSystem "Notification System" {
            reportingSystem -> user "Send notifications"
            reportingSystem -> tecnico
            reportingSystem -> mobileApp "Receive notifications"
        }
    }

    views {
        systemContext RepairIT {
            include *
            autolayout  lr
        }

        container RepairIT {
            include * 
            autolayout 
        }
        component mobileApp {
            include *
            autolayout 
        }
        
        theme default


    styles {
            element "aprendiz" {
                shape "Person" 
                background "#26cf48" 
                color "#ffffff" 
            }
            element "Database" {
                shape "Cylinder" 
                background "#ec0e0e" 
                color "#ffffff" 
            }
             element "Mobile" {
                shape "MobileDevicePortrait" 
                background "#A0B4F4" 
                color "#F8F8F8" 
            }
           element "Web" {
                shape "WebBrowser" 
                background "#B544C4" 
                color "#F8F8F8" 
            }
           
        }
    }

}
