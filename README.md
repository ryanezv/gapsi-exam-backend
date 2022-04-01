### Examen de prueba

#### Clonar el repositorio de Github
```
git clone https://github.com/ryanezv/gapsi-exam-backend.git
```
##### Ejecutar proyecto
1. `gradle build`

2. `gradle bootRun`

Expuesto sobre el puerto default 8080

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

- Usar la herramieta practica para ejecutar endpoints desde terminal: `https://httpie.io/`
- Tambien agrego el postmant collection (por correo)

URLs del servicio REST (con http pie):

```json
A continuación se agregan los comandos desde terminal con "http pie":

Obtener todos los proveedores
http GET :8081/api/suppliers
  Ejemplos (queryparams)
        Obtener 2 registros por pagina
        http GET :8081/api/suppliers size==2
        Posicionarnos en la pagina 4 (2 registro por pagina)
        http GET :8081/api/suppliers size==2 page==4
        
Obtener un proveedor
http GET :8081/api/suppliers/{id}

Eliminar un proveedor
http DETELE :8081/api/suppliers/{id}

Alta de un proveedor
http POST :8081/api/supplier name={name} business={business} direction={direction}
Ejemplo:
http POST :8081/api/supplier name=Supplier\ 20 business=SAdeCV direction=Aqui
        
Obtener datos del usuario/candidato
http :8081/api/user

Obtener datos de la aplicacion
exam http :8081/api/app/version
```    