[![Build Status](https://travis-ci.org/jangrott/diacritics-removal.svg?branch=master)](https://travis-ci.org/jangrott/diacritics-removal)

# diacritics-removal
This app can easily remove all diacritics from text or file.

## How to run
1. Download the zip file https://drive.google.com/file/d/0BxFMmgb4cyKQSGZ6WDVCSk11ZTA/view?usp=sharing
2. Extract it
3. Run ./bin/diacritics-removal

### Example usage
###### Remove diacritics from text
```
./bin/diacritics-removal -t "{text with diacritics}"
```
###### Remove diacritics from file content
```
./bin/diacritics-removal -f {path to file}
```

### For developers only
##### Building
```
gradle installDist
```
##### Running
```
./build/install/diacritics-removal/bin/diacritics-removal
```
