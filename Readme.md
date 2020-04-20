docker build -t service-loan:v1 .
docker run -p 8084:8084  --name service-loan --network aforo255 -d service-loan:v1

Trabajo final

1. simular pago dep restamos nobre BD (bd_prestamos) SQL Server
1.1. Crear una tabla tb_cronograma_prestamos
campos:
Id int autogenerado
nroprestamos int
couta int
fecha_vencimiento string
dias int
capital double
interes double
importe_cuota double
pagado boolean

BD Mysql
1.2. crea la tabla transaccion
Id int autogenerado
nroprestamo int
importe_couta double
couta int

Historical Mongo DB
1.2 crear tabla transaccion
Id int autogenerado
nroprestamo int
importe_couta dobule
couta int

Eealizar:
1. cuando conuman el endpoint de prestamos se debe registrar la transaccion en la BD Mysql. POST /prestamo
2. el consumidor debe actualizar el estado del numero de couta a pagado (true), en un inicio el estado sera False
3. se debe registrar la transaction desde historical en MongoDB.