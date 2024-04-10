package mx.edu.itesca.practica_11

data class User(var firtsname : String ?= null, var lastname : String ?= null,
    var age : String ?= null){
    override fun toString()=firtsname+ "\t" + lastname + "\t" + age
}
