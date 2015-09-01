@echo off

for %%f in (*.svg) do (
  echo Found "%%f"
  convert -background none -density 72 "%%f" "..\..\anchor.edit\icons\full\obj16\%%~nf.gif"
  convert -background none -density 100 "%%f" "..\..\anchor.design\icons\%%~nf.png"
)

for %%f in (..\..\anchor.edit\icons\full\ctool16\*.gif) do (
  echo Found "%%f"
  for /f "tokens=3 delims=_" %%i in ("%%~nf") do (
    copy "..\..\anchor.edit\icons\full\obj16\%%i.gif" "%%f"
  )
)
