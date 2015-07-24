class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

//        "/"(view:"/index")
        
        "/"(controller:"home", action: "index")
        "/login"(controller:"login",action:"auth")
        "500"(view:'/error')
	}
}
