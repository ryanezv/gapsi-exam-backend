### Examen de prueba

##### Ejecutar proyecto
1. `gradle build`

2. `gradle bootRun`

##### Tecnologias usadas:
- Spring Boot (incluido Tomcat)
- JPA
- HIBERNATE
- H2 Database
- Java 11

##### IDEs
- IntelliJ IDEA (plugin vue.js, gradle, git)

#### Base de Datos
Los registros en la BD se cargar inicialmente desde el archivo:
`resources/db.json`

RECOMENDACIONES:

Usar la herramieta practica para ejecutar endpoints desde terminal: `https://httpie.io/`

URLs del servicio REST:

```json
# Obtener todos los proveedores
http GET :8081/api/suppliers

# Obtener un proveedor
http GET :8081/api/suppliers/{id}

# Eliminar un proveedor
http DETELE :8081/api/suppliers/{id}

# Alta de un proveedor
http POST :8081/api/supplier  description={description} direction={direction} email={email} name={name} phone={phone}
Ejemplo:
exam http POST :8081/api/supplier  description=gggg direction=gggg email=ggg name=Supplier\ 01 phone=ggg
        
# Obtener datos del usuario/candidato
http :8081/user

#Obtener datos de la aplicacion
exam http :8081/app/version

```    