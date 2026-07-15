# Instrucciones

## Comandos enviroment
```
python -m venv .venv
```
```
.\.venv\Scripts\Activate.ps1
```

Si da error de permisos 
```
Set-ExecutionPolicy -Scope Process -ExecutionPolicy Bypass
```

## Instrucciones si tienes problemas con el pip
```
python -m venv .venv --without-pip
```

```
.\.venv\Scripts\Activate.ps1
```

### Instalar pip manualmente
```
Invoke-WebRequest https://bootstrap.pypa.io/get-pip.py -OutFile get-pip.py
python get-pip.py

python -m pip --version
```

```
python -m pip install -r requirements.txt
```

## Dependencias

```
python -m pip install --upgrade pip
```

```
pip install -r requirements.txt
```

## Compilar
```
java -jar $env:CLASSPATH -Dlanguage=Python3 .\grammar\Expr.g4
```

## Correr app

```
streamlit run app.py
```

## comando para desactivar
```
deactivate
```

# Instrucciones si tienes problemas con el pip
```
python -m venv .venv --without-pip
```

```
.\.venv\Scripts\Activate.ps1
```

## Instalar pip manualmente
```
Invoke-WebRequest https://bootstrap.pypa.io/get-pip.py -OutFile get-pip.py
python get-pip.py

python -m pip --version
```
```
python -m pip install -r requirements.txt
```
