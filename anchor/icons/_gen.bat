@echo off

for %%f in (*.svg) do (
  echo Found "%%f"
  convert -background none -resize 16x16 "%%f" "..\..\anchor.edit\icons\full\obj16\%%~nf.gif"
  convert -background none "%%f" "..\..\anchor.design\icons\%%~nf.png"
)
